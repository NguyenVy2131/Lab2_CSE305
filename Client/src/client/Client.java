/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

/**
 *
 * @author LENOVO
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contract longTerm = new LongTerm();
        longTerm.BuildContractID();
        longTerm.BuildPropertyID();
        longTerm.BuildTenantID();
        longTerm.BuildRentAmount();
        longTerm.SignContract();
        
        Contract permanent = new Permanent();
        permanent.BuildContractID();
        permanent.BuildPropertyID();
        permanent.BuildTenantID();
        permanent.BuildRentAmount();
        permanent.SignContract();

        
        Contract shortTerm = new ShortTerm();
        shortTerm.BuildContractID();
        shortTerm.BuildPropertyID();
        shortTerm.BuildTenantID();
        shortTerm.BuildRentAmount();
        shortTerm.SignContract();
    }
    
}
