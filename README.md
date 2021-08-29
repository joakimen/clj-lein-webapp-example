# clj-lein-webapp-example

Example-webapp in Clojure using [ring](https://github.com/ring-clojure/ring) and [reitit](https://github.com/metosin/reitit).

![build-badge](https://github.com/joakimen/clj-lein-webapp-example/actions/workflows/clojure.yml/badge.svg)

## Usage

### Run locally

```sh
$ lein uberjar
$ java -jar target/app.jar
$ curl localhost:3000
Hello, World!
```

### Run in Docker

```sh
$ docker run -it --rm -p 3000:3000 joakimen/clj-lein-webapp-example:0.1.0
$ curl localhost:3000
Hello, World!
```

### Run in Kubernetes

```sh
$ kubectl apply -k k8s/
$ kubectl port-forward deployment/clj-lein-webapp-example 3000
$ curl localhost:3000
Hello, World!
```

### Development with Tilt

Tilt automates the process from a file is saved until it is running in Kubernetes. While Tilt is running, Tilt will watch all project-files and perform the following when a file is saved:

* Build new Docker-image from current project files with a `tilt-*`-tag
* Apply Kustomize-files with the new Tilt-image (does not affect actual yaml-files)

Start Tilt:

```sh
tilt up
```
