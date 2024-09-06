package Bank_industry;

import java.text.SimpleDateFormat;
import java.util.Date;

//GLOBAL VARIABLE 
public class Variable {
    
    public static  int choice;
    public static  int account_index=0;

    public static String  current_date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    
    public static int is_deposite_user_found=0;
    public static int deposite_index=0;

    public static int is_withdraw_user_found=0;
    public static int withdraw_index=0;

    public static int is_tranfer_user_found=0;
    public static int transfer_index=0;

    public static int is_view_transac_found=0;
    public static int view_transac_index=0;

    public static int is_update_acc_found=0;
    public static int is_update_acc_index=0;

    public static int is_close_acc_found=0;
    public static int close_acc_index=0;
    
}
