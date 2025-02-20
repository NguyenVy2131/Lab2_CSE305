/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

/**
 *
 * @author LENOVO
 */
public class LongTerm implements Contract {
    private String ContractID;
    private String PropertyID;
    private String TenantID;
    private double RentAmount;
    
    
    @Override
    public void BuildContractID() {
        this.ContractID = "LONG456";
    }

    @Override
    public void BuildPropertyID() {
        this.PropertyID = "PROP002";
    }

    @Override
    public void BuildTenantID() {
        this.TenantID = "TEN002";
    }

    @Override
    public void BuildRentAmount() {
        this.RentAmount = 7000.0;
    }

    @Override
    public Contract SignContract() {
        System.out.println("Long-Term Contract Signed!");
        return this;
    }
    
    
    
}
