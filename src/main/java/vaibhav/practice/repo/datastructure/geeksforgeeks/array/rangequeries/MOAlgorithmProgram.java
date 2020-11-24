package vaibhav.practice.repo.datastructure.geeksforgeeks.array.rangequeries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Query {

	int L;
	int R;
}

public class MOAlgorithmProgram {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 1, 4, 5, 6, 1, 2 };

		List<Query> queries = new ArrayList<>();
		queries.add(new Query(0, 4));
		queries.add(new Query(1, 3));
		queries.add(new Query(1, 4));

		queryResults(arr, arr.length, queries, queries.size());
	}

	private static void queryResults(int[] arr, int n, List<Query> queries, int m) {
		// find block size
		int block = (int) Math.sqrt(n);

		// sort all queries so that queries of the same blocks are arranged together
		Collections.sort(queries, new Comparator<Query>() {

			// function used to sort all queries so that all queries of the same block are
			// arranged together and within a block queries are sorted in increasing order
			// of R values

			@Override
			public int compare(Query q1, Query q2) {

				// Different blocks, sort by block
				if (q1.L / block != q2.L / block)
					return (q1.L < q2.L ? -1 : 1);

				// same block, sort by R values
				return q1.R < q2.R ? -1 : 1;
			}
		});

		// initialize current L, current R and current sum
		int currL = 0, currR = 0;
		int currSum = 0;

		// traverse through all queries
		for (int i = 0; i < m; i++) {
			// L and R values of current range
			int L = queries.get(i).L;
			int R = queries.get(i).R;

			// remove extra elements of previous range. for example if previous range is
			// [0,3] and current range is [2,5], then arr[0], arr[1] are subtracted
			while (currL < L) {
				currSum -= arr[currL];
				currL++;
			}

			// add elements of current range
			while (currL > L) {
				currSum += arr[currL - 1];
				currL--;
			}

			while (currR <= R) {
				currSum += arr[currR];
				currR++;
			}

			// remove elements of previous range. For example when previous range is [0,10]
			// and current range is [3,8], then arr[9] and arr[10] are subtracted
			while (currR > R + 1) {
				currSum -= arr[currR - 1];
				currR--;
			}

			// print sum of current range
			System.out.println("Sum of [" + L + ", " + R + "] is " + currSum);
		}

	}

}
