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
public class OrderDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public OrderDAO() {
		
	}
   public boolean insertOrder(OrderDTO product){
   boolean result=false;
    String query="INSERT INTO [dbo].[Order]\n" +
"           ([id]\n" +
"           ,[UserID]\n" +
"           ,[Date]\n" +
"           ,[O_Quantity])\n" +
"     VALUES(?,?,?,?)";
           
       try {conn = DBUtils.getConnection();
          if (conn != null){
              ps =conn.prepareStatement(query);
            ps.setInt(1,product.getId());
            ps.setInt(2, product.getUid());
               ps.setString(3, product.getDate());
            ps.setInt(4,product.getQuantity());
   
            ps.executeUpdate();
            result = true;
          }
       } catch (Exception e) {
            System.out.println(e.getMessage());
       }
   return result;
   }
   public List<OrderDTO> userOrders(int id) {
        List<OrderDTO> list = new ArrayList<>();
         String query="select * from [dbo].[Order] where [UserID]=? order by orderID desc";
        try {
          
           conn = DBUtils.getConnection();
              ps =conn.prepareStatement(query);
                 ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next())
            {
            OrderDTO order = new OrderDTO();
            ProductDAO dao=new ProductDAO();
                int pid=rs.getInt("id");
                ProductDTO product = dao.getProductByID(String.valueOf(pid));
                 order.setOrderID(rs.getInt("OrderID"));
                order.setId(pid);
                order.setName(product.getName());
                //order.setCategory(product.getCategory());
                order.setPrice(product.getPrice()*rs.getInt("O_Quantity"));
                order.setQuantity(rs.getInt("O_Quantity"));
                order.setDate(rs.getString("Date"));
                list.add(order);
            }
            
            
            
       } catch (Exception e) {
       }
        return list;
    
}
    public void cancelOrder(int id) throws ClassNotFoundException {
        //boolean result = false;
         String   query = "DELETE FROM [dbo].[Order]\n" +
"      WHERE [OrderID]=?";
        try {
           conn = DBUtils.getConnection();
            ps = this.conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            //result = true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
        }
        //return result;
    }
   
   
//   public static void  main(String args[])
//   {    boolean check;
//    List<OrderDTO> list=new ArrayList<>();
//  // OrderDTO d =new OrderDTO(4,2,2,"2024-06-23 10:00:00");
//      OrderDAO o= new OrderDAO();
//     //  check= o.insertOrder(d);
//       list= o.userOrders(21);
//       for (OrderDTO orderDTO : list) {
//           System.out.println(orderDTO);
//       }
//   //    System.out.println(check);
//   
//   }

}
