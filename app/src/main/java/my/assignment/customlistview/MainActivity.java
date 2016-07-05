package my.assignment.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ListView listView;
    ArrayList<Contacts> contactList=new ArrayList<Contacts>();

    Contacts mContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);
        mContacts=new Contacts("Priyanka","9652792707");
        contactList.add(mContacts);
        mContacts=new Contacts("Nitin","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Prakash","9985942065");
        contactList.add(mContacts);
        mContacts=new Contacts("Varsha","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Susmita","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Priya","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Mayank","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Jay","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Swati","9985942095");
        contactList.add(mContacts);
        mContacts=new Contacts("Palak","9985942095");
        contactList.add(mContacts);

        listView.setAdapter(new CustomAdapter(this,contactList));


    }
}
