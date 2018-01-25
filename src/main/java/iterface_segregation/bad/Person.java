/**
 * $Id: $
 * $Change: $
 *
 * Copyright Murex S.A.S., 2003-2018. All Rights Reserved.
 *
 * This software program is proprietary and confidential to Murex S.A.S and its
 * affiliates ("Murex") and, without limiting the generality of the foregoing
 * reservation of rights, shall not be accessed, used, reproduced or distributed
 * without the express prior written consent of Murex and subject to the
 * applicable Murex licensing terms.
 *
 * Any modification or removal of this copyright notice is expressly prohibited.
 */
package iterface_segregation.bad;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Person implements IWorker {
    public Person() {
    }


    public void work() {
        //working
    }

    public void eat() {
        //eating
    }
}
