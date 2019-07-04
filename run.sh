#!/bin/sh

lang=$BAZEL_LANG
defaultLang="scala"

if [ -z "$lang" ]
then
    echo "no BAZEL_LANG found using default lang $defaultLang"
    lang=$defaultLang
fi

bazel build //hello-world-$lang:MainApp \
    && bazel run hello-world-$lang:MainApp \
    && bazel query --nohost_deps  --noimplicit_deps "deps(//hello-world-$lang:MainApp)" --output graph