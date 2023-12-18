package Model;

import Domain.TranasctionHeader;
import Domain.TransactionDetail;
import java.util.ArrayList;

public class TransactionModel {
    //will be used by user to create new transaction
    private TranasctionHeader singleTransaction;
    private ArrayList<TransactionDetail> transactionList;

    //used by admin to get all transction
    private ArrayList<TranasctionHeader> getAllTransaction;


    private TranasctionHeader getSingleTransaction() {
        return this.singleTransaction;
    }

    private void setSingleTransaction(TranasctionHeader singleTransaction) {
        this.singleTransaction = singleTransaction;
    }

    private ArrayList<TransactionDetail> getTransactionList() {
        return this.transactionList;
    }

    private void setTransactionList(ArrayList<TransactionDetail> transactionList) {
        this.transactionList = transactionList;
    }

    private ArrayList<TranasctionHeader> getGetAllTransaction() {
        return this.getAllTransaction;
    }

    private void setGetAllTransaction(ArrayList<TranasctionHeader> getAllTransaction) {
        this.getAllTransaction = getAllTransaction;
    }

    public void createTransaction(TranasctionHeader transactionInput, ArrayList<TransactionDetail> itemList){

    }

}
