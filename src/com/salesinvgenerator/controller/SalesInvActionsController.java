package com.salesinvgenerator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Monica.George
 */
public class SalesInvActionsController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       String actionValue = e.getActionCommand();
        switch (actionValue) {
            case "Load File":
                loadFile();
                System.out.println("LoadFile");
                break;

            case "Save File":
                saveFile();
                System.out.println("SaveFile");
                break;

            case "New Invoice":
                createNewInvoice();
                System.out.println("NewInvoice");
                break;

            case "Delete Invoice":
                deleteInvoice();
                System.out.println("deleteinvoice");
                break;

            case "New":
                createNewItem();
                System.out.println("NewItem");
                break;

            case "Delete":
                deleteItem();
                System.out.println("deleteitem");
                break;

          /*  case "Create Invoice":
                createInvoice();
                break;

            case "Cancel Invoice":
                cancelInvoice();
                break;

            case "Create Line":
                createLine();
                break;

            case "Cancel Line":
                cancelLine();
                break; */
        }
    }

    private void loadFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createNewInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createNewItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cancelInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cancelLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

    

