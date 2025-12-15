public class ListNode{
  private String data;
  private ListNode next, prev;

  public ListNode(String d){ //default next/prev should be null
  }
  
  public String toString(){} // Return the string of the data
  
  public String getData(){} // Return the data
  
  public ListNode next(){} // Return the next node
  
  public ListNode prev(){} // Return the previous node
  
  public String setData(String newdata){}// Replace the data, with the newdata, return the original data.
  
  public void setNext(ListNode n){}
  
  public void setPrev(ListNode n){} 

}
