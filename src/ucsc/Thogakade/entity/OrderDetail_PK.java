/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;



/**
 *
 * @author Taniya
 */

@Embeddable

public class OrderDetail_PK implements Serializable{
    int oID;
    int iID;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int oID, int iID) {
        this.oID = oID;
        this.iID = iID;
    }
    
    
    
}
