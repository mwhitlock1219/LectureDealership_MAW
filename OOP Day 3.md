## Object Relationships

### Association

- loose relationship, lifetimes of Object are independent of one another

- "is-a" relationship (doesnt apply to every instance of an Association)

#### Composition

- "has-a" relationship or a "part-of"
- A dealership "has a" Dept \* the depts don't exist outside of a dealership, therfore its a Composition relationship

#### Aggregation

- A dealership also "has" Vehicles, but its a less tightly couples relationship
  - Vehicles cpme and go throught the dealership and the dealership can manipulate the while it "owns" them
  - But, ultimately, a Vehicle _can_ exist outside of a dealership - this is called **aggregation**

## Generics

- allows us to create classes and methods that can be used on multiple kinds of data types, elements, etc
- <E> for elements, <T> for data types, <K> for key, <V> for values
- we can "bound" our generics to specific user-generate objects/type by using the "extends" keyword
  - example: <E extends Vehicle>

## OOP Design Patterns

- Sounds really intimidating, but its not
- A convention so well recognized that it has a name and when someone calls a pattern by its name, everyone knows what they're talking about

## Factory Pattern

- A method for creating objects without exposing the logic needed for creation
- SUPER common pattern in OOP
- using a Factory insulates the consumer from the actual class implementation

* Why is this important? Why use a factory instead of relying on the new Keyword?

  - **abstraction** and **insulation**

--

## When to use abstract classes, generic classes and interfaces

#### Abstract Classes

A blueprint to use for something else

- Do you need both abstract and non-abstract methods?
- Are you okay with class being able to only implement one of you?
- Do you expressly need to add new functionality or do you need some other stuff too?

#### Interface

Added functionality to something athat already exists

- Do you only need non-abstract methods?
- Are you easily named as an adjective? (has -ible or -able at the end)
- Can you be paired with other interfaces and work together to add more functionality?

#### Generic Class

- Do you need to work with multiple data types or object types?
