# Poll refactoring kata

## Goals

The objective of this kata is to refactor the code, and a little new feature.

To do so, you are strongly encouraged to use [Approval Tests](https://approvaltests.com/).

You should also reflect on the use of unit tests, and how they can help you during the refactoring.


## The kata

This kata is designed to be performed in two stages:
- clean-up and add tests
- add the new feature

### Cleaning-up

Before even considering adding a new feature to this code, you should first add some tests.

#### Tips

To start, try to add a few tests using approval tests. Then refactor the code and see how adding unit tests makes helps you making better design decisions. 

Also, consider which strategies you could use to improve the code once you are confident you have a solid set of tests.

### Adding a new feature

Right now, the results of the poll are displayed in the order of the questions. Change the code so that the answers are ordered by votes (most popular first).

#### Tips

When adding this new feature, ask yourself how you can do this safely. Do you have unit tests? Should you?
