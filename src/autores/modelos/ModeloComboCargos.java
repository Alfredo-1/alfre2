/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ALFRED
 */
public class ModeloComboCargos extends DefaultComboBoxModel{
    public ModeloComboCargos(){
        //crea una variable cargo tipo Cargo y guarda las cosas que hay en Cargo.Values()
        for(Cargo cargo: Cargo.values()){
            this.addElement(cargo);
        }
    }
    public Cargo obtenerCargo() {
        return (Cargo)this.getSelectedItem();
    }
}
