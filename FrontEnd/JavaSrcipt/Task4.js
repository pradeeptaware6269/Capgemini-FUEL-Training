/*
Task 4: Product Array
Create an array of five product names.
Perform the following operations:
- Print all products.
- Add one product at the end.
- Add one product at the beginning.
- Remove the first product.
- Remove the last product.
- Display the final array.
*/

var products = ["Laptop", "TV", "AC", "Cooler", "Fan"];

// Print all products
console.log("Original Array:", products);

// Add one product at the end
products.push("Keyboard");
console.log("After push():", products);

// Add one product at the beginning
products.unshift("Mobile");
console.log("After unshift():", products);

// Remove the first product
products.shift();
console.log("After shift():", products);

// Remove the last product
products.pop();
console.log("After pop():", products);

// Display the final array
console.log("Final Array:", products);