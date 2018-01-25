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
package open_closed.bad;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Greeter {
    private String formality;

    public String greet() {
        if (this.formality.equals("formal")) {
            return "Good evening, sir.";
        }
        else if (this.formality.equals("casual")) {
            return "Sup bro?";
        }
        else if (this.formality.equals("intimate")) {
            return "Hello Darling!";
        }
        else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
