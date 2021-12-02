class NameEncoderDecoder{
  
  public String encode(String name){

    name =name.replace("e","1").replace("u","2").replace("i","3").replace("o","4").replace("a","5");
    name = "NOTFORYOU" + name+"YESNOTFORYOU";
    return name;
  }
  
  public String decode(String name){
    name =  name.replace("YESNOTFORYOU","");
   name =  name.replace("NOTFORYOU","").replace("YES","");
    
   name =  name.replace("1","e").replace("2","u").replace("3","i").replace("4","o").replace("5","a");
    
    return name;
  }
}
