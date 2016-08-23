package com.sv.visionplus.util.payment;

import com.sv.visionplus.util.payment.model.TPayment;

/**
 *
 * @author Mohan
 */
//XXX:KASUN
public class PaymentUtil {
    private final PaymentDialog paymentDialog;
    private static PaymentUtil INSTANCE;
    
    //TODO:singleton instance of PaymentUtil
    public static final PaymentUtil getInstance(){
        if (INSTANCE==null) {
            INSTANCE=new PaymentUtil();
        }
        return INSTANCE;
    }

    //TODO:constructor private, init final local field PaymentDialog
    

    public PaymentUtil() {
        this.paymentDialog = null;
    }
    
    //TODO:get payment method
    public PaymentUtil(TPayment payment) {
        this.paymentDialog = null;
    }
}
