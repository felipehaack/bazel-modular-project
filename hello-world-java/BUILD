packagePath = "src/main/java/com/example/java/"

java_binary(
    name = "MainApp",
    main_class = "com.example.java.MainApp",
    srcs = [
        packagePath + "MainApp.java"
    ],
    deps = [
        ":printer",
        ":services"
    ]
)

java_library(
    name = "printer",
    srcs = [
        packagePath + "helpers/Printer.java"
    ]
)

java_library(
    name = "services",
    srcs = glob([
        packagePath + "services/*.java"
    ])
)