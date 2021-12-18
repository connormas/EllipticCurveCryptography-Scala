# Elliptic Curve Cryptography in Scala

This is a small set of code where I'm reimplemneting some common
elliptic curve cryptography functions in pure Scala. I'm doing this because
I'm going to be building a hardware accelerator in Chisel to accelerate this
computation.

Writing out functional models is not only a good exercise, but will also later
serve as a way to test my Chisel module. Feel free to look around at some of
the implementations, but I wouldn't use them in your own code base. For a
full fledged implementation with more extensive documentation, consider 
checking out python-ecdsa by tlsfuzzer (on github), or tinyec which is 
available through PyPI. 

(I might decide later to turn this into an actual library for use, but as of
right now (12-17-21), this code base is merely a scratchpad where I'm writing 
tests for myself and getting familier with ecc.)
