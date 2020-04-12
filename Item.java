class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	 float a = 0.18;
	 float b = 0.05;
	 int c = 0;
	
	//TODO constructor
	Item(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	//TODO setters and getters
	void setName(String name){
  this.name = name;
}
String getName(){
  return this.name;
}
void setPrice(double price){
  this.price = price;
}
double getPrice(){
  return this.price;
}
String getName(){
  return this.name;
}
void setID(int id ){
  this.id = id;
}
int getID(){
  return this.id;
}
	double taxReturn () {
		//TODO
		return this.price*0.15;
	}
}

class Receipt{
  private List<Item> items;
  Receipt(List<Item> items){
    this.items = items;  
  }
  public List getItems(){
    return this.items;  
  }
  public void setItems(List<Item> items){
    this.items = items;  
  }
}