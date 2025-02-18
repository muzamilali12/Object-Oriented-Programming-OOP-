class Book{
String title;
String author;
boolean isAvailable;
Book(String title, String author, boolean isAvailable){
this.title = title;
this.author = author;
this.isAvailable = isAvailable;
}
void barrowBook(){
if(isAvailable == false){
System.out.println("Book is UnAvailable");}
else{
System.out.println("the book is Issued");
}
}

void returnBook(){
if(isAvailable == true);
System.out.println("Now Book is Available");
}
void displayBookDetails(){
System.out.println("Name of Book : " + title);
System.out.println("Name of Book author : " + author);
System.out.println("is Book Available : " + isAvailable);

}
public static void main(String [] args){
Book b1 = new Book("Muzamil Ali", "Cricket Knowledge", true);
b1.barrowBook();
b1.barrowBook();
b1.returnBook();

b1.displayBookDetails();
}
}