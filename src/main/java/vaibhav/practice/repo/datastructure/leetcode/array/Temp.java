package vaibhav.practice.repo.datastructure.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Temp {

	public static void main(String[] args) {
		Temp temp = new Temp();
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

//		temp.moveZeroes(arr);
//
//		for (int i : arr) {
//			System.out.print(i + "\t");
//		}

//		int minimumStudentsMoved = temp.heightChecker(arr);
//
//		System.out.println(minimumStudentsMoved);

//		int output = temp.thirdMax(arr);
//		System.out.println(output);

//		List<Integer> findDisappearedNumbers = temp.findDisappearedNumbers(arr);
//
//		System.out.println(findDisappearedNumbers);

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= arr.length; i++) {
			list.add(i);
		}

		List<Integer> asList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list = list.stream().filter(e -> !asList.contains(e)).collect(Collectors.toList());

		System.out.println(list);

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		int N = nums.length;

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		for (int i = 0; i < N; i++) {
			if (list.contains(nums[i])) {
				list.remove(list.indexOf(nums[i]));
			}
		}

		return list;
	}

	public void moveZeroes(int[] nums) {

		int writePointer = 0;
		for (int readPointer = 0; readPointer < nums.length; readPointer++) {
			if (nums[readPointer] != 0) {
				nums[writePointer] = nums[writePointer] + nums[readPointer];
				System.out.println(nums[writePointer]);
				nums[readPointer] = nums[writePointer] - nums[readPointer];
				System.out.println(nums[readPointer]);
				nums[writePointer] = nums[writePointer] - nums[readPointer];
				System.out.println(nums[writePointer]);

				writePointer++;
			}
		}
	}

	public int heightChecker(int[] heights) {
		int[] sortedHeights = new int[heights.length];

		for (int i = 0; i < heights.length; i++) {
			sortedHeights[i] = heights[i];
		}
		Arrays.sort(sortedHeights);

		int minimumStudentsMoved = 0;

		for (int i = 0; i < sortedHeights.length; i++) {
			if (heights[i] != sortedHeights[i]) {
				minimumStudentsMoved++;
			}
		}

		return minimumStudentsMoved;
	}

	public void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public int thirdMax(int[] nums) {
		// handle edge cases
		if (nums.length == 0) {
			return 0;
		}

		if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		}

		// set size which number of element we want to search
		long[] res = new long[3];
		for (int i = 0; i < res.length; i++) {
			res[i] = Long.MIN_VALUE;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > res[0]) {
				res[0] = nums[i];
			} else if (nums[i] > res[1]) {
				res[1] = nums[i];
			} else if (nums[i] > res[2]) {
				res[2] = nums[i];
			}
		}

		if (nums[2] == Long.MIN_VALUE) {
			return (int) res[0];
		}

		return (int) res[2];
	}

	public int thirdMax1(int[] nums) {
		// edge case
		if (nums.length == 0) {
			return 0;
		}

		if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		}

		int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE, m3 = Integer.MIN_VALUE;
		boolean thirdSet = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > m1) {
				if (m1 >= m2) {
					if (m2 >= m3) {
						m3 = m2;
						thirdSet = true;
					}
					m2 = m1;
				}
				m1 = nums[i];
			} else if (nums[i] >= m2 && nums[i] <= m1 && nums[i] >= m3) {
				if (m2 >= m3) {
					m3 = m2;
					thirdSet = true;
				}
				m2 = nums[i];
			} else if (nums[i] >= m3 && nums[i] <= m1 && nums[i] <= m2) {
				m3 = nums[i];
				thirdSet = true;
			}
		}

		if (!thirdSet || m2 == m3) {
			return m1;
		}

		return m3;
	}
}
