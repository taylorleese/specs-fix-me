## specs-fix-me

Contains example failing specs that need fixing.

### Running tests

    git clone git@github.com:taylorleese/specs-fix-me.git
    cd specs-fix-me
    sbt

    > test
    [info] CoinSpecs
    [info]
    [info] Find the minimum number of coins for a value X given a list of denominations.
    [info]
    [info] Find the minimum number of coins
    [error] x Denominations: [1], Value: 12, Expected: 12
    [error]     '-1' is not equal to '12' (CoinSpecs.scala:22)
    [error] x Denominations: [1, 2, 3], Value: 6, Expected: 2
    [error]     '-1' is not equal to '2' (CoinSpecs.scala:22)
    [error] x Denominations: [1, 3, 4], Value: 6, Expected: 2
    [error]     '-1' is not equal to '2' (CoinSpecs.scala:22)
    [error] x Denominations: [1, 5, 10, 25], Value: 41, Expected: 4
    [error]     '-1' is not equal to '4' (CoinSpecs.scala:22)
    [error] x Denominations: [1, 4, 5, 15], Value: 8, Expected: 2
    [error]     '-1' is not equal to '2' (CoinSpecs.scala:22)
    [info]
    [info]
    [info]
    [info] Total for specification CoinSpecs
    [info] Finished in 327 ms
    [info] 5 examples, 5 failures, 0 error
    [info]
    [error] Failed: : Total 5, Failed 5, Errors 0, Passed 0, Skipped 0
    [error] Failed tests:
    [error] 	com.specsfixme.tests.CoinSpecs
    [error] {file:/Users/tleese/specs-fix-me/}default-8b812d/test:test: Tests unsuccessful
    [error] Total time: 1 s, completed Mar 8, 2012 2:34:51 AM
    >
