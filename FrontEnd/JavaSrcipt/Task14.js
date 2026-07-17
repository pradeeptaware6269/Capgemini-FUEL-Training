function greet(name) {
    return name;
}

function display(name, callback) {
    console.log(callback(name));
}

display("ram", greet);