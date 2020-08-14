# NoQsHereIsALab
No Questions? Here is a Lab, then...

## Build a Bottom Up Index

This lab is an outline of code to be created. 

### Start a new Java/Maven project from scratch.

Fork, and clone this repo onto your computer.

Create a new Java/Maven project in this directory. 
Once the creation complete, commit and push. 

### Requirements

* from the command line, run the program with a URL. `noq "https://nytimes.com"`
* read the HTML page from the URL over HTTP into a large string `body`
* scan thru finding all URLs on the page and placing them into a list of URLs tobe visited
* remove all the HTML tags from the body
* scan thru the body, creating a hashmap of `<string, Node>`
* after its thru scanning, output the hashmap and the URL-list as JSON so it could be used in the future

### Node

Node should represent what we find in the document about each word. Maybe something like:

```
Node:
  String word
  Integer occurences
  ArrayList<Integer> offsets
```

And on creation each word should be "porter stemmed" (look it up). This will make words like "gopher" and "gophers" be the same entry. Another example is "bicycle", "bicycling" and "bicycled", where a stemming would probably end up with "bicycl" as the stem.

### Output

Be sure to put the URL into the JSON output. The idea here is to drop into a file all the results of the processing. And making something that allows you to reuse the JSON in another tool, perhaps one that combines hundreds of processed documents into one large index.

(And the topic of another lab in the future).