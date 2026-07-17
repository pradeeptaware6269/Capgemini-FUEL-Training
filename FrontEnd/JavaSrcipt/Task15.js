// Task 15: Greeting Application
// Create four callback functions.
// They should display:
// ```
// Good Morning Rahul
// Good Afternoon Rahul
// Good Evening Rahul
// Good Night RahulA

function morning(name) {
    return "Good Morning " + name;
}

function afternoon(name) {
    return "Good Afternoon " + name;
}

function evening(name) {
    return "Good Evening " + name;
}

function night(name) {
    return "Good Night " + name;
}

function greet(name, callback) {
    console.log(callback(name));
}

greet("Rahul", morning);
greet("Rahul", afternoon);
greet("Rahul", evening);
greet("Rahul", night);