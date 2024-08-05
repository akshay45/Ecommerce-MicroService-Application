FROM ubuntu:latest
LABEL authors="akshr"

ENTRYPOINT ["top", "-b"]