/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

/**
 *
 * @author LENOVO
 */
public class Permanent implements Contract {
    private String ContractID;
    private double RentAmount;
    private String TenantID;
    private String PropertyID;
    
    
    @Override
    public void BuildContractID() {
        this.ContractID = "PERM123";
    }

    @Override
    public void BuildPropertyID() {
        this.PropertyID = "PROP001"; 
    }

    @Override
    public void BuildTenantID() {
        this.TenantID = "TEN001";
    }

    @Override
    public void BuildRentAmount() {
        this.RentAmount = 5000.0;
    }

    @Override
    public Contract SignContract() {
        System.out.println("Permanent Contract Signed!");
        return this;
    }
    
}
