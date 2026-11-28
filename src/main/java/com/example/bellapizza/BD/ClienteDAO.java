package com.example.bellapizza.BD;

import com.example.bellapizza.entities.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    public static boolean actualizarCliente(Cliente c) throws SQLException {

        String sql = "insert into usuarios (id,nombre, usuario, email, password,tipo,activo) values (?,?,?,?,?,?,?)";

        Connection con = ConexionBD.abrirConexion();
//      Quedaste aqui, error en el id? revisar bd. 
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(7, c.getId());
        ps.setString(1, c.getNombre());
        ps.setString(2, c.getUsuario());
        ps.setString(3, c.getCorreo());
        ps.setString(4, c.getContrasena());
        ps.setString(5, "cliente");
        ps.setBoolean(6, true);

        ps.executeUpdate();

        int res = ps.executeUpdate();

        ps.close();

        return res > 0;

    }
}
