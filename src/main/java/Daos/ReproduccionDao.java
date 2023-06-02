package Daos;

import Beans.Reproduccion;

import java.sql.*;
import java.util.ArrayList;

public class ReproduccionDao {

    private static String user = "root";
    private static String pass = "root";
    private static String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";


    public ArrayList<Reproduccion> obtenerListaReproduccion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Reproduccion> listaTours = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT r.cancion_idcancion as ID, c.nombre_cancion as CANCION, c.banda, count(r.idreproduccion) as `conteo` \n" +
                     "FROM lab6sw1.reproduccion r\n" +
                     "inner join lab6sw1.cancion c on r.cancion_idcancion = c.idcancion\n" +
                     "group by cancion_idcancion \n" +
                     "having count(idreproduccion)>2 \n" +
                     "order by count(cancion_idcancion) desc;")) {

            while (rs.next()) {
                String conteo = rs.getString(1);
                String cancion_idcancion = rs.getString(2);
                listaTours.add(new Tour(id,nombre,banda));
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la busqueda");
        }
        return listaTours;
    }




}
