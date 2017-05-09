package com.rm.dell.card_view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 4/8/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Context ctx;

    public ContactAdapter(ArrayList<Contact> contacts, Context ctx){
        this.contacts = contacts;
        this.ctx = ctx;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view,ctx,contacts);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
Contact CON = contacts.get(position);
        holder.person_img.setImageResource(CON.getImage_id());
        holder.person_name.setText(CON.getName());
        holder.person_email.setText(CON.getEmail());
        holder.person_phone.setText(CON.getPhone());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public static class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView person_img;
        TextView person_name,person_email,person_phone;
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        Context ctx;
        public ContactViewHolder(View view,Context ctx,ArrayList<Contact> contacts){
            super(view);
            this.contacts = contacts;
            this.ctx = ctx;
            view.setOnClickListener(this);
            person_img=(ImageView)view.findViewById(R.id.img);
            person_name=(TextView)view.findViewById(R.id.Name);
            person_email=(TextView)view.findViewById(R.id.Email);
            person_phone=(TextView)view.findViewById(R.id.phone);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Contact contact = this.contacts.get(position);
            Intent intent = new Intent(this.ctx,Contact_Activity.class);
            intent.putExtra("img_id",contact.getImage_id());
            intent.putExtra("name",contact.getName());
            intent.putExtra("email",contact.getEmail());
            intent.putExtra("mobile",contact.getPhone());
            this.ctx.startActivity(intent);
        }
    }
}
