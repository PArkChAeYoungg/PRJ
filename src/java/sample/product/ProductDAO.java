/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author OS
 */
public class ProductDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<ProductDTO> getAllProducts() throws Exception {
        List<ProductDTO> list = new ArrayList<>();
        String sql = "SELECT [id]\n" +
"      ,[name]\n" +
"      ,[image]\n" +
"      ,[price]\n" +
"      ,[title]\n" +
"      ,[description]\n" +
"      ,[quantity]\n" +
"  FROM [dbo].[product]";

        try (Connection conn = DBUtils.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(new ProductDTO(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getInt(7)));
                }
            }
        }
        return list;
    }

    public ProductDTO getLast() {
        String query = "select top 1 * from product order by id desc";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<ProductDTO> getProductByCID(String cid) throws Exception {
        List<ProductDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM [product]\n"
                + "where cateID=?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }

    public ProductDTO getProductByID(String id) throws Exception {

        String sql = "select* from [dbo].[product] where id=?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return null;
    }

    public List<ProductDTO> getProductByName(String name) throws Exception {
        List<ProductDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM [product]\n"
                + "where [name] like ?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }

    public void delete(String pid) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("delete from product\n"
                        + "where id=?");
                ptm.setString(1, pid);
                ptm.executeUpdate();
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void insertProduct(int id, String name, String image, double price, String title, String description, String category, int quantity) {
        String query = "INSERT INTO [dbo].[product]\n" +
"           ([id]\n" +
"           ,[name]\n" +
"           ,[image]\n" +
"           ,[price]\n" +
"           ,[title]\n" +
"           ,[description]\n" +
"           ,[cateID]\n" +
"           ,[quantity])\n" +
"     VALUES (?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(query);
                ptm.setInt(1, id);
                ptm.setString(2, name);
                ptm.setString(3, image);
                ptm.setDouble(4, price);
                ptm.setString(5, title);
                ptm.setString(6, description);
                ptm.setString(7, category);
                ptm.setInt(8, quantity);
                ptm.executeUpdate();
            }
        } catch (Exception e) {
        }

    }

    public void editProduct(String name, String image, String price,
            String title, String description, String category, int quantity, String pid) {
        String query = "update product\n"
                + "set name = ?,\n"
                + "image = ?,\n"
                + "price = ?,\n"
                + "title = ?,\n"
                + "description = ?,\n"
                + "cateID = ?,\n"
                + "quantity=? \n"
                + "where id = ?";
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setInt(7, quantity);
            ps.setString(8, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
       public List<Cart> getCartProducts(ArrayList<Cart> cartList) throws ClassNotFoundException {
        List<Cart> book = new ArrayList<>();
        String  query = "select * from product where id=?";
        try {
            if (cartList.size() > 0) {
                for (Cart item : cartList) {
                conn = DBUtils.getConnection();
                    ps = this.conn.prepareStatement(query);
                    ps.setInt(1, item.getId());
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        Cart row = new Cart();
                        row.setId(rs.getInt("id"));
                        row.setName(rs.getString("name"));
                      //  row.setCategory(rs.getString("category"));
                        row.setPrice(rs.getDouble("price")*item.getQuantity());
                        row.setQuantity(item.getQuantity());
                        book.add(row);
                    }

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return book;
    }
       
       public double getTotalCartPrice(ArrayList<Cart> cartList) throws ClassNotFoundException {
        double sum = 0;
        String  query = "select price from product where id=?";
        try {
            if (cartList.size() > 0) {
                for (Cart item : cartList) {
                   // query = "select price from products where id=?";
                 conn = DBUtils.getConnection();
                   ps = this.conn.prepareStatement(query);
                    ps.setInt(1, item.getId());
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        sum+=rs.getDouble("price")*item.getQuantity();
                    }

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sum;
    }
       
       
//
    public static void main(String[] args) throws Exception {
        ProductDAO dao = new ProductDAO();
        dao.insertProduct(26, "s", "32", 324, "dasdasd", "3", "1", 4);
//        dao.editProduct("ádasd", "saa", "32","2312", "adsadasd", "2", 60, "19");
        List<ProductDTO> p = dao.getAllProducts();
        ProductDTO z =dao.getProductByID("2");
 //       System.out.println(z);
//        for (ProductDTO productDTO : p) {
//            System.out.println(productDTO);
//        }
        List<Cart> l =new ArrayList<>();
    }
}
