# GiftRibbitWebAutomation
 
FALL 2021

COMP 680

Author: Alejandra Soto


Summary: 

Testing Automation for GiftRibbit staging environment using Selenium webdriver and chromedriver. The test cases that were automated were as follows:

--> Teacher Login with valid login, invalid email login, and invalid password login.

    // Run the Invalid Email Teacher Login Test
    loginInvalidEmailTeacherTest(driver);

    // Run the Invalid Email Teacher Login Test
    loginInvalidPassTeacherTest(driver);

    // Run the Valid Teacher Login Test
    loginTeacherTest(driver);


--> Parent Login with valid login, invalid email login, and invalid password login.

    // Run the Invalid Email Teacher Login Test   
    loginInvalidEmailParentTest(driver);

    // Run the Invalid Email Teacher Login Test
    loginInvalidPassParentTest(driver);

    // Run the Valid Parent Login Test
    loginParentTest(driver);
    
    
--> Teacher Wishlist functionality for adding an item, editing an item, and deleting an item from wish-list.    
        
    // Test adding item to wish list 
    addItemWishlistTest(driver, itemTitle);

    // Test edit item from wish list    
    editItemWishlistTest(driver, itemTitle, editedTitle);

    // Test remove item from wishlist    
    removeItemWishlistTest(driver, editedTitle);
       
    
--> Parent Donation functionality for donating an item from the wish-list.    
      
    // Test donating item from wish list
    donateItemWishlist(driver, itemTitle);  
    
