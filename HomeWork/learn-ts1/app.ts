//---------------template string question------------//
let str0: string = "microsoft excel";
console.log(str0.toUpperCase());

let str2: string = "GOOGLE AND APPLE";
console.log(str2.toLowerCase());

let str3: string = "hello world";
console.log(
  str3.charAt(0).toUpperCase() +
    str3.slice(1, 6) +
    str3.charAt(6).toUpperCase() +
    str3.slice(7, str3.length)
);

// //---------------template string question------------//
// // (a)
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
//---------------------Lab 09 Dec 2020 -----------------
let student: any = {
  name: "John",
  age: 22,
  active: false,
  parents: {
    dad: "Tom",
    mom: "Jane",
  },
  grade: "A",
};

let student2: any = { ...student };
console.log(student2);
student2.grade = null;
console.log(student2.grade);
for (let key in student2) {
  console.log(key, student2[key]);
}
student2.isActive = true;
console.log(student2);
delete student2.isActive;
console.log(student2);
//--------ARRAY-------Lab 09 Dec 2020 -----------------
let fruits = ["Apple", "Pear", "Orange"];
let shoppingCart = fruits;
shoppingCart.push("Banana");
console.log(fruits.length);

let str = "Apple, Cat, Zoo, Bird, Dog";
let input = str.split(", ").sort();
console.log(input);

let num1 = [123, 132, 423, 423, 12345, 5343, 52, 10904, 64];
for (let i in num1) {
  if (num1[i].toString().charAt(0) == "1") {
    console.log(num1[i]);
  }
}

let fruit = ["Apple", "Mango", "Cat", "Banana"];
fruit.splice(2, 1, "Orange");
fruit.sort();
console.log(fruit);

//-----------------------SLIDE241--------------------
const heroes = [
  {
    id: "a001",
    name: "Thor",
    weapons: ["axe", "hammer"],
  },
  {
    id: "a002",
    name: "Tony",
    weapons: ["iron suite"],
  },
];
let heroesMap = new Map();
heroes.map((item) => heroesMap.set(item.id, item));
console.log(heroesMap);
console.log(heroesMap.get("a001"));
console.log(heroesMap.get("a002"));
heroesMap.delete("a001");
console.log("Delete a001");
console.log(heroesMap);

//----------------------SLIDE328--------------------
let areaRectangle = (width: number, lengthh: number) => {
  let area = width * lengthh;
  return area;
};
console.log("Area 3,7 : " + areaRectangle(3, 7));
let isPrime = (num: number) => {
  for (let i = 2; i < num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return num > 1;
};
console.log("37 isPrime : " + isPrime(37));
console.log("39 isPrime : " + isPrime(39));

//----------------------SLIDE336--------------------
interface IdCard {
  idNumber: number;
  name: string;
  surname: string;
  address: string;
}
interface subject {
  subjectName: string;
}
interface subjectDetail {
  subject: subject;
  subjectCode: string;
  subjectCredit: number;
}
console.log("interface example");
//-----------------------SLIDE351--------------------
enum translationEnum {
  English = "English",
  Thai = "Thai",
  French = "French",
  Dutch = "Dutch",
}
let switchEnum = (code: number) => {
  switch (code) {
    case 1:
      return translationEnum.English;
    case 2:
      return translationEnum.Thai;
    case 3:
      return translationEnum.French;
    case 4:
      return translationEnum.Dutch;
    default:
      return translationEnum.English;
  }
};
console.log("input 1 :", switchEnum(1));
console.log("input 2 :", switchEnum(2));
console.log("input 3 :", switchEnum(3));
console.log("input 4 :", switchEnum(4));

//----------------------SLIDE362--------------------
let arrNumber = new Array<number>();
arrNumber.push(3);
// arrNumber.push('3'); //error
interface StudentDetail {
  studentID: number;
  name: string;
  surname: string;
}
let studentDetail = new Map<string, StudentDetail>();
let std: StudentDetail = {
  studentID: 9999,
  name: "John",
  surname: "Doe",
};
studentDetail.set("007", std);
console.log(studentDetail);
