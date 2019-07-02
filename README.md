# bazel-scala-minimal-example
This is a minimal example of Hello World running on Bazel 0.23.0

## How to install Bazel on MAC

Download the `sh` file version supported for this project via CURL or any other tool on the following URL [Bazel 0.23.0](https://github.com/bazelbuild/bazel/releases/download/0.23.0/bazel-0.23.0-installer-darwin-x86_64.sh)

After download the file, you just need to run the file via sh. It will place the application under the folder `/usr/local/bin`

```$xslt
$ cd $FOLDER
$ sh bazel-0.23.0-installer-darwin-x86_64.sh
$ rm -rf bazel-0.23.0-installer-darwin-x86_64.sh
``` 

Check the installed version by running the command
```$xslt
$ bazel version
```

## How to build and run
 
```$xslt
$ bazel build //hello-world:MainApp
$ ./bazel-bin/hello-world/MainApp
```


## Check the graph of the hello world

```$xslt
$ bazel query --nohost_deps  --noimplicit_deps "deps(//hello-world:MainApp)" --output graph
```

Or copy and paste the following graph
```$xslt
digraph mygraph {
  node [shape=box];
"//hello-world:MainApp"
"//hello-world:MainApp" -> "//hello-world:src/main/scala/com/example/MainApp.scala"
"//hello-world:src/main/scala/com/example/MainApp.scala"
}
```

Copy and paste the printed graph into the field box in this link [Web Graph](http://www.webgraphviz.com/).