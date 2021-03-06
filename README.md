# CalcApp

Calculator application will append mathematical expressions into a StringBuilder, calculate the result and populate a TextView.
The application can be viewed in both portrait and landscape orentation.

************

Research

1. Define the following terms: View, ViewGroup, View Hierarchy.

View is basic widget or item displayed on the User Interface of an app. They consist of Buttons, TextViews, Spinners, etc.

ViewGroup acts as a container for both Views and ViewGroups. Linear Layout, Relative Layout, ConstraintLayout, FrameLayout are all types of ViewGroups. Every root element of a layout is rendered first starting from its ViewGroup.

View Hierarchy defines the tree-like structure that begins with a ViewGroup as its root and may consist of child elements which can be other Views and ViewGroups.


2. Explain in detail how the following layouts render, a what unique items each has that must be implemented: Constraint, Linear, Coordinator, Grid and Relative?

Constraint Layout   -  uses the existing views to dictate position of rending
                      with because of the flat view hierarchy
 Relative Layout     -  It must render twice, with first the parent View
 Coordinator        - Coordinator is now deprecated. s a container for a specific interaction with one or more child views.
 Grid               - It renders grid patterns with the child views and associates them to rows and columns.

3.  What are Listeners?

Used to capture events in android. Triggered when the user interacts with an existing item in the UI by some signal such as tapping, swiping, shaking, etc.


4. How does Java garbage collection work?

JGC is an autonomous memory management system provided by the JVM to free unused heap space in memory. Usually objects are made on the heap regardless of scope. It's purpose is to relief the developer from manually managing memory management like
in developing in C++ programming allowing for more development time. It is done by a daemon thread called the Garbage Collector.

5. Explain the software development lifecycle.

Planning .  -   Coordinating with team on prospective goals for project, resources, etc.
Analysis .  - Sourcing for system requirements such as technologies and recourses which will be used. 
Design .  -  Creating system requirements and following mockups, schema and documentation.
Implementation . -  Developing project based off material regarding system design.
Testing . -         Continuous testing of system.
Maintainance -      Monitoring the application while in production.
