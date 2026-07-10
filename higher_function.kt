fun main() {
    val app = listOf("Nykaa","Myntra","Amazon","Zomato","Hyphen")
    app.forEach(){		    /* foreach loop is used for printing elements only */
        println(it)			/* In for each loop there is no break statement
                             small code can be used with filter  */
    }
    var amount_spend = listOf(100.0,200.0,300.0)
    val amount_with_gst = amount_spend.map{ /* maps are used to manupilate data and 
                                             return list as output*/
        it * 1.18
    }
    println(amount_with_gst)
    
    /*using filter we can display those elements 
     who will satify the condition and also return as list*/
     
     val all_apps = mutableListOf("Nykaa","Myntra","Amazon","Zomato","Hyphen")
     val blocked_apps = listOf("Nykaa","Zomato","Hyphen")
     
     val active_app = all_apps.filter{
         it !in blocked_apps
     }
     println(active_app)
}