/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.five.min.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import no.five.min.entity.Product;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Stigus
 */
public class ProductRowMapper implements RowMapper<Product> {

    public ProductRowMapper() {
    }

    @Override
    public Product mapRow(ResultSet rs, int rowIndex) throws SQLException {
        return new Product(
        rs.getInt("productid"),
        rs.getString("productName"),        
        rs.getString("description"),
        rs.getBigDecimal("smallprice"),
        rs.getBigDecimal("mediumprice"),
        rs.getBigDecimal("largeprice"),
        rs.getBoolean("deleted")
        );
    }
    
}