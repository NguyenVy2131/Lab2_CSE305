/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

/**
 *
 * @author LENOVO
 */
public class ShortTerm implements Contract{
    private String ContractID;
    private double RentAmount;
    private String TenantID;
    private String PropertyID;  

    @Override
    public void BuildContractID() {
        this.ContractID = "SHORT789";
    }

    @Override
    public void BuildPropertyID() {
        this.PropertyID = "PROP003";
    }

    @Override
    public void BuildTenantID() {
        this.TenantID = "TEN003";
    }

    @Override
    public void BuildRentAmount() {
        this.RentAmount = 3000.0;
    }

    @Override
    public Contract SignContract() {
        System.out.println("Short-Term Contract Signed!");
        return this;
    }
    
}
