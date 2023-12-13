## Purpose

Abstract Factory is a creational design pattern that allows you to produce families of related objects without having to specify their concrete classes.

## Problem 

Imagine that you are creating a simulator of web input element types. Your code consists of classes that represent:

A family of related products, such as: ```Button``` + ```Checkbox``` + ```Etc...```.

Several variants of this family. For example: ```WindowsButton```, ```WindowsCheckbox```, ```MacOSButton```, ```MacOSCheckbox```, ```Etc...```.
