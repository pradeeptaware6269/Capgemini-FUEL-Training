function greet() {
    return "Good Morning Student";
}

function display(callback) {
    console.log(greet());
}

display(display);