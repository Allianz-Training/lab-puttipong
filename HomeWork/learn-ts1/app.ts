// var str:string = 'hello'

// console.log(str.charAt(2))

// var str1:string = "hello"
// var str2:string = "world"
// console.log(`${str1} ${str2}`);

//---------------template string question------------//
let str: string = "microsoft excel";
console.log(str.toUpperCase());

let str2: string = "GOOGLE AND APPLE";
console.log(str2.toLowerCase());

let str3: string = "hello world";
console.log(
  str3.charAt(0).toUpperCase() +
    str3.slice(1, 6) +
    str3.charAt(6).toUpperCase() +
    str3.slice(7, str3.length)
);

//---------------template string question------------//
// (a)
let str4: string = "Hello world";
console.log(str4.startsWith("Hello"));
console.log(str4.startsWith("world"));

console.log(str4.endsWith("Hello"));
console.log(str4.endsWith("world"));

let str5 = "Computer";
let str6 = "Death Race";
let str7 = "Republican";

console.log(str5.slice(3, 6));
console.log(str6.slice(0, 5));
console.log(str7.slice(2, 8));

console.log("-------------------Lab3------------------------");
console.log("1,000,000 = " + 1e6);
console.log("10,000,000 = " + 1e7);
console.log("43,000,000,000 = " + 4.3e10);
console.log("0.000012 = " + 1.2e-5);
console.log("0.0000001234 = " + 1.234e-7);
console.log("1e10 = " + 1 * 10 ** 10);
console.log("2e5 = " + 2 * 10 ** 5);
console.log("122e8 = " + 122 * 10 ** 8);
console.log("1e-8 = " + 1 * 10 ** -8);
console.log("12e-5 = " + (1.2 * 10 ** -4).toFixed(5));
console.log("-------------------Lab4&Lab5------------------------");
let num: number[] = [100, 111, 55, 21, 99];
num.map((item) => console.log(`${item} to octa =  ${item.toString(8)}`));
num.map((items) => console.log(`${items} to hexa =  ${items.toString(16)}`));
console.log("round 12.423 = " + Math.round(12.423));
console.log("round 31313.135 = " + Math.round(31313.135));
console.log("round 42.809 = " + Math.round(42.809));
