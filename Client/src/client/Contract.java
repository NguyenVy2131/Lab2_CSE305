/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package client;

/**
 *
 * @author LENOVO
 */
public interface Contract {
    public void BuildContractID();
    public void BuildPropertyID();
    public void BuildTenantID();
    public void BuildRentAmount();
    public Contract SignContract();
}
