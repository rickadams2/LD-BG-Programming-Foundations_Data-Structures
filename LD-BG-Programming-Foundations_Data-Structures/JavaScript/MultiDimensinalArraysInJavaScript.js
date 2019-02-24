var dinnerChoices = [["Salad", "soup", "Cheese Plate"], ["Chicken", "Salamon", "Lasagna"]]

let appIndex = 0 
let mainDishIndex =  1 

let firstApp = dinnerChoices[appIndex][0]
let seccondApp = dinnerChoices[appIndex][1]
let thirdMainDish = dinnerChoices[mainDishIndex][2]

console.log(firstApp)
console.log(seccondApp)
console.log(thirdMainDish)

dinnerChoices[mainDishIndex][0] = "Steak" 
console.log(dinnerChoices[mainDishIndex[0]])

console.log(dinnerChoices)