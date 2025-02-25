/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintenancerequest;

/**
 *
 * @author LENOVO
 */
public class LowPriorityConcreteCreator extends RequestCreator{

    @Override
    public RequestProduct createRequest() {
        return new LowPriorityConcrete();
    }
    
}
