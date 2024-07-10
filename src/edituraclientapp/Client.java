/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edituraclientapp;

/**
 *
 * @author daniel
 */
public class Client {

    public static String add(java.lang.String autor, java.lang.String titlu) {
        com.aosd.editura.client.EdituraWS_Service service = new com.aosd.editura.client.EdituraWS_Service();
        com.aosd.editura.client.EdituraWS port = service.getEdituraWSPort();
        return port.add(autor, titlu);
    }
    
}
