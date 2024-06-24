/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sample.product.ProductDTO;
import sample.utils.DBUtils;

/**
 *
 * @author OS
 */
public class CategoryDAO {
     public List<CategoryDTO> getAllCategory() throws Exception {
    List<CategoryDTO> list = new ArrayList<>();
    String sql = "SELECT * FROM [Category]";

    try (Connection conn = DBUtils.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new CategoryDTO(rs.getInt(1),
                                        rs.getString(2)));
                        }
        }
    }
    return list;
}
     
     
     
     
     
         public static void main(String[] args) throws Exception
    {
        CategoryDAO dao = new CategoryDAO();
        List<CategoryDTO> list =dao.getAllCategory();
        for (CategoryDTO productDTO : list) {
            System.out.println(productDTO);
        }
    }
     
}
