# [Sierpinski-Triangle](https://en.wikipedia.org/wiki/Sierpi%C5%84ski_triangle)
Application illustrates the Sierpinski Triangle which is a fractal shape.  Program takes number of order and displays the shapes accordingly.

- The Sierpinski Triangle is a fractal shape that is named after the Polish mathematician Wacław Sierpiński who described it in 1915. It is a self-similar triangle that is formed by recursively subdividing an equilateral triangle into four smaller equilateral triangles and removing the central triangle. This process is repeated on each of the remaining smaller triangles, producing an infinitely complex pattern.

- The Sierpinski Triangle is a fascinating example of a fractal, which is a geometric shape that exhibits self-similarity at different scales. In other words, the same basic shape is repeated at smaller and smaller scales, resulting in a pattern that looks similar at all levels of magnification.

- The Sierpinski Triangle has many interesting properties and has applications in various fields such as computer graphics, image compression, and chaos theory. It is also a popular subject in recreational mathematics and is often used as an example of a fractal shape.

- Program is built simply using the JavaFX elements and using the Recursion method to solve the problem.
Demo run with the number of order input: 3

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/230288225-5e5846c7-2dcf-48f0-9916-46a480c2090c.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/Sierpinski-Triangle/tree/main/src/SierpinskiTriangle)

- The code is divided into two files: `SierpinskiTriangle.java` and `SierpinskiTrianglePane.java`. SierpinskiTriangle.java is the main class that extends the Application class, and SierpinskiTrianglePane.java is a custom class that extends the Pane class.
- The SierpinskiTriangle class is the main class that contains the start method, which is the entry point of the JavaFX application. It sets up the stage, scene, and user interface elements.
- In the start method, a new instance of SierpinskiTrianglePane is created. This is the custom pane that will display the Sierpinski Triangle.
- A `TextField` named `tfOrder` is created. This text field allows the user to enter the order of the Sierpinski Triangle.
- An event handler is set on the tfOrder text field using a lambda expression. Whenever the user presses Enter in the text field, the event handler retrieves the entered order and sets it on the `trianglePane` object.
- A `HBox` named hBox is created to hold the label and text field. It is aligned to the center.
- `BorderPane` named `borderPane` is created and the `trianglePane` is set as the center node, and the hBox is set as the bottom node.
- A new `Scene` is created with the borderPane as its root node, and its dimensions are set to 400x400 pixels.
- The Scene is set on the `Stage`, the title of the stage is set to "Sierpinski Triangle," and the stage is shown.
- Two event listeners are added to the scene's width and height properties. These listeners call the paint method of the `trianglePane` whenever the width or height of the scene changes.
- The `SierpinskiTrianglePane` class represents the custom pane that displays the Sierpinski Triangle. It extends the Pane class.
- The SierpinskiTrianglePane class has a private integer variable order, which represents the order or level of the Sierpinski Triangle.
- The `setOrder` method is used to set the order value and trigger the paint method to redraw the triangle.
- The paint method is responsible for drawing the Sierpinski Triangle. It first calculates the coordinates of the three points of the outer triangle based on the width and height of the pane.
- The paint method clears the children of the pane and then calls the `displayTriangles` method with the initial order and the three points of the outer triangle.
- The `displayTriangles` method is a recursive method that draws the Sierpinski Triangle. If the order is 0, it creates a Polygon object representing a triangle and adds it to the pane's children. Otherwise, it recursively calls itself three times, each time with a lower order and new points calculated as midpoints of the current triangle's sides.
