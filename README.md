# COMP-3940 Assignment 2

#### Group 3
Term: Set 3G, Fall 2022 \
Members: Chengyang Li, Sehyun Park, Alex Pu, Melanie Ta, Shen Yen

### How to run
- Stay in the root folder uploadserver
- Compile classes using:
```
    javac ConsoleApp/*.java
    javac CustomException/*.java
    javac HttpServlet/*.java
    javac UploadServer/*.java
```
- To run ConsoleApp, use: `java ConsoleApp/Activity` (need to start server first)
- To start UploadServer, run: `java UploadServer/UploadServer`


### Description
- Launch a upload form in http://localhost:8888/. Through the web form, users can upload their images of choice. Upon submission, the server will display a list of images in the html page.
- Users can also connect to the server using ConsoleApp. Upon sending an image, the server will return a JSON string of all the current images.

### Project structure
    ├── ConsoleApp              # Java console app to upload images
    ├── CustomException         # Custom exceptions
    ├── HttpServlet             # Servlet, request, and response classes
    ├── images                  # Store all images
    └── UploadServer            # Server

- Server log message can be found in log.txt

### Contribution
- Chengyang Li
  - Develop user input for Console App
  - JSON parsing for Console app
  - Write images data from Console app to Server
- Sehyun Park
  - Parse HTTP Request for Console App
  - Parse HTTP Request for Web
  - Manage multi-threading flow in UploadServerThread
- Alex Pu:
  - Custom exceptions
  - Manage Exceptions and Logs
  - Video
- Melanie Ta
  - Manage code structure
  - Construct request for Console App
  - Construct server's response
- Shen Yen
  - Develop user input for Console App
  - Write images data from Console app to Server
  - Video
