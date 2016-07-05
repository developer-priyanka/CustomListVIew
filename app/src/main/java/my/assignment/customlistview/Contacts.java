package my.assignment.customlistview;

/**
 * Created by root on 7/5/16.
 */

public class Contacts {
    private String mName;
    private String mPhone;

    public Contacts(String name,String phone){
        mName=name;
        mPhone=phone;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
