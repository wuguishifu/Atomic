# Atomic
Library to aid in the storage of molecules and related data.

The main way this data structure is created is off of the idea that a matrix can be used to represent if bonds exist. Take water, H2O. One could construt a 3x3 matrix with col/row for each atom, then put a non-zero value for each bond. This would look something like this:

  H1  H2  O1
H1         1
H2         1
O1 1   1

etc.
