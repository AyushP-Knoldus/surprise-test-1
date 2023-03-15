package com.knoldus
//Capitalize a particular character in String and also display the count of that character in that string
object SurpriseTestGroupB extends App{
  def capitalizeCharacterAndCount(characterToCapitalize : Char , userString : String ) : Unit={
    def countLength(frequency : Int , index : Int) : Int={
      if(index == 0)
        {
          frequency
        }
      else
        {
          if(userString(index) == characterToCapitalize)
            {
              countLength(userString,frequency+1,index-1)
              userString(index).toUpper()
            }
        }
    }
    countLength(0,userString.length-1)
  }
capitalizeCharacterAndCount('a',"ayush")
}
