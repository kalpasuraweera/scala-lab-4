var itemNames = Array("rice", "sugar", "milk", "biscuit", "ice")
var itemQuantity = Array(50, 25, 10, 35, 25)
var numItems = itemNames.length 

@main def main():Unit = 
    displayInventory()
    restockItem("milk", 5)
    sellItem("milk", 10)
    restockItem("milky", 5)
    sellItem("ice-cream", 5)



def displayInventory(n:Int = 0):Unit =
    n match{
        case x if numItems == 0 => println("Inventory is Empty")
        case x if x == numItems -1  => printf("Item: %s | Quantity: %d\n",itemNames(n), itemQuantity(n))
        case _ => {
            printf("Item: %s | Quantity: %d\n",itemNames(n), itemQuantity(n))
            displayInventory(n+1)
        }
    }


def restockItem(itemName:String, quantity:Int, n:Int = 0):Unit =
    n match{
        case x if x == numItems  => printf("Item Name %s Not Found\n",itemName)
        case x if itemNames(n) == itemName => {
            itemQuantity(n)+= quantity
            printf("Item Updated\nItem: %s | Quantity: %d\n",itemNames(n), itemQuantity(n))
        }
        case _ => {
            restockItem(itemName:String, quantity:Int, n+1)
           
            
        }
    }

def sellItem(itemName:String, quantity:Int, n:Int = 0):Unit =
    n match{
        case x if x == numItems  => printf("Item Name %s Not Found\n",itemName)
        case x if itemNames(n) == itemName => {
            itemQuantity(n)-= quantity
            printf("Item Updated\nItem: %s | Quantity: %d\n",itemNames(n), itemQuantity(n))
        }
        case _ => {
            sellItem(itemName:String, quantity:Int, n+1)
           
            
        }
    }